package com.mkyong.controller

import groovy.xml.XmlUtil
import java.security.SecureRandom
import persistence.entities.User
import persistence.entities.Day
import java.util.ArrayList


public class WorkoutRepository {

		def personFile=new File("${new File(new File(".").getCanonicalPath())}//src//main//resources//persons.xml")
		def personXML= new XmlParser().parse(personFile)
		def workoutFile=new File("${new File(new File(".").getCanonicalPath())}//src//main//resources//workoutplan.xml")
		def workoutXML= new XmlParser().parse(workoutFile)

	def createCycle(String username, String date){

		def userNode = personXML.person.find{it -> 
			it.@username == username}

		//def df1 = new SimpleDateFormat("dd/MM/yyyy")
		//date = df1.parse(date)
		Date d = Date.parse("dd/MM/yyyy", date)

		if(userNode != null){
			def goal = userNode.goal.text()

			def workoutNode = workoutXML.plan.find{it -> 
				it.@id == goal}

			if(workoutNode != null){
				workoutNode.day.each{it -> 
					def node = userNode.workoutPlan[0]	
					it.@id = d.format("dd/MM/yyyy")
					//new Node (node,"", d.toString())
					node.append(it)
					d=d.next()
				}
				userNode.nextUpdate[0].value = 	d.format("dd/MM/yyyy")

				personFile.withWriter ("utf-8") {writer ->
					writer.writeLine(new XmlUtil().serialize(personXML))}
			}
		}	

	}
/*
	def getCurrentCycle(String username){
		def userNode = personXML.person.find{it -> 
			it.@username == username}

		def nextUpdate = userNode.nextUpdate.text()
		Date d = Date.parse("dd/MM/yyyy", nextUpdate)
		ArrayList<Day> currCycle = new ArrayList<Day>()
		for(int i = 0; i<5; i++){
			d = d.previous()
			prevDate= d.format("dd/MM/yyyy")
			def workoutDay=userNode.workoutPlan[0].day.find{it ->
				it.@id == prevDate}
			
			ArrayList<Exercises> exercises = new ArrayList<Exercises>()
			workoutDay.exercise.each{it ->
				
			}

			Day day = new Day(userNode.userWeight.text().toDouble(), prevDate, true, ArrayList<Exercises> exercises)

		}


	}

*/
}	