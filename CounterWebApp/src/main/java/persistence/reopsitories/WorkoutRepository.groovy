package com.mkyong.repository

import groovy.xml.XmlUtil
import java.security.SecureRandom
import persistence.entities.User
import persistence.entities.Day
import persistence.entities.Exercises
import persistence.entities.Set
import java.util.ArrayList


public class WorkoutRepository {

		/*def personFile=new File("${new File(new File(".").getCanonicalPath())}//src//main//resources//persons.xml")
		def personXML= new XmlParser().parse(personFile)
		def workoutFile=new File("${new File(new File(".").getCanonicalPath())}//src//main//resources//workoutplan.xml")
		def workoutXML= new XmlParser().parse(workoutFile)
*/
	def createCycle(String username, String date){
		def personFile=new File("${new File(new File(".").getCanonicalPath())}//src//main//resources//persons.xml")
		def personXML= new XmlParser().parse(personFile)
		def workoutFile=new File("${new File(new File(".").getCanonicalPath())}//src//main//resources//workoutplan.xml")
		def workoutXML= new XmlParser().parse(workoutFile)

		def userNode = personXML.person.find{it -> 
			it.@username == username}
			println "comment 1"
			println userNode
		//def df1 = new SimpleDateFormat("dd/MM/yyyy")
		//date = df1.parse(date)
		Date d = Date.parse("dd/MM/yyyy", date)

		if(userNode != null){
			def goal = userNode.goal.text()
			println "comment 2"
			def workoutNode = workoutXML.plan.find{it -> 
				it.@id == goal}

			if(workoutNode != null){
				println "comment 3"
				workoutNode.day.each{it -> 
					def node = userNode.workoutPlan[0]	
					it.@Date = d.format("dd/MM/yyyy")
					it.@Goal = userNode.goal.text()
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

	def getCurrentCycle(String username){

		def personFile=new File("${new File(new File(".").getCanonicalPath())}//src//main//resources//persons.xml")
		def personXML= new XmlParser().parse(personFile)
		def workoutFile=new File("${new File(new File(".").getCanonicalPath())}//src//main//resources//workoutplan.xml")
		def workoutXML= new XmlParser().parse(workoutFile)

		def userNode = personXML.person.find{it -> 
			it.@username == username}

		def nextUpdate = userNode.nextUpdate.text()
		Date d = Date.parse("dd/MM/yyyy", nextUpdate)
		ArrayList<Day> currCycle = new ArrayList<Day>()
		for(int i = 0; i<5; i++){
			d = d.previous()
			def prevDate= d.format("dd/MM/yyyy")
			def workoutDay=userNode.workoutPlan[0].day.find{it ->
				it.@Date == prevDate}
			
			ArrayList<Exercises> exercises = new ArrayList<Exercises>()

			workoutDay.exercise.each{it ->
				ArrayList<Set> sets = new ArrayList<Set>()
				it.set.each{iterator ->
					Set set = new Set(iterator.reps.text().toInteger(), null, iterator.@id.toInteger() )
					sets.add(set)
				}
				Exercises exercise = new Exercises( it.name.text(), sets, it.@id.toInteger() )
				exercises.add(exercise)
			}

			Day day = new Day(userNode.userWeight.text().toDouble(), prevDate, userNode.wentToGym.text(), exercises)
			currCycle.add(day)	
		}

		return currCycle

	}


	def getSpecificDay(String username, String date){

		def personFile=new File("${new File(new File(".").getCanonicalPath())}//src//main//resources//persons.xml")
		def personXML= new XmlParser().parse(personFile)
		def workoutFile=new File("${new File(new File(".").getCanonicalPath())}//src//main//resources//workoutplan.xml")
		def workoutXML= new XmlParser().parse(workoutFile)

		def userNode = personXML.person.find{it -> 
			it.@username == username}

		def workoutDay = userNode.workoutPlan[0].day.find{it ->
			it.@Date == date}

			ArrayList<Exercises> exercises = new ArrayList<Exercises>()

			workoutDay.exercise.each{it ->
				ArrayList<Set> sets = new ArrayList<Set>()
				it.set.each{iterator ->
					Set set = new Set(iterator.reps.text().toInteger(), null, iterator.@id.toInteger() )
					sets.add(set)
				}
				Exercises exercise = new Exercises( it.name.text(), sets, it.@id.toInteger() )
				exercises.add(exercise)
			}


			Day day = new Day(userNode.userWeight.text().toDouble(), date, workoutDay.wentToGym.text(), exercises)
			
			return day

	}

	def updateSet(String username, Double dbWeight, int noOfSet, int exerciseID, String date){

		def personFile=new File("${new File(new File(".").getCanonicalPath())}//src//main//resources//persons.xml")
		def personXML= new XmlParser().parse(personFile)
		def workoutFile=new File("${new File(new File(".").getCanonicalPath())}//src//main//resources//workoutplan.xml")
		def workoutXML= new XmlParser().parse(workoutFile)
		println "comment 1"
		def userNode = personXML.person.find{it -> 
			it.@username == username}
		if(userNode != null){
		def workoutDay = userNode.workoutPlan[0].day.find{it ->
			it.@Date == date}
			println "comment 2"
			if(workoutDay != null){
				def exerciseNode = workoutDay.exercise.find{it ->
					it.@id == exerciseID.toString()}
					println "comment 3"
				if(exerciseNode != null){
					def setNode = exerciseNode.set.find{it ->
						it.@id == noOfSet.toString()}
						println "comment 4"
					if(setNode != null){
						new Node (setNode, "dbWeight", dbWeight)
						println "updateset er her"
						personFile.withWriter ("utf-8") {writer ->
							writer.writeLine(new XmlUtil().serialize(personXML))}
						return true

					}
					

				}
				
			}
					
		}


	}

	def wentToGym(String username, String date){
		def personFile=new File("${new File(new File(".").getCanonicalPath())}//src//main//resources//persons.xml")
		def personXML= new XmlParser().parse(personFile)

		def userNode = personXML.person.find{it -> 
			it.@username == username}
		if(userNode != null){
			def dayNode = userNode.workoutPlan[0].day.find{it ->
				it.@id == date}

				if(dayNode!=null){
					Date d = Date.parse("dd/MM/yyyy", date)		

					new Node (dayNode, "wentToGym", "true")

					def loop = true
					while(loop){
						d=d.previous()
						def preDayNode = userNode.workoutPlan[0].day.find{it ->
							it.@id == d.format("dd/MM/yyyy")}
						if(preDayNode!=null){
							def check = preDayNode.wentToGym.findAll{}	
							if(check.size()>0){
								loop = false
							}
							else{
								new Node (preDayNode, "wentToGym", "false")
							
							}
						}
						else loop = false
					}
					personFile.withWriter ("utf-8") {writer ->
							writer.writeLine(new XmlUtil().serialize(personXML))}
				}


		}
			
	}
	
	def getDaysByID(String username, int id, String goal ){
		def personFile=new File("${new File(new File(".").getCanonicalPath())}//src//main//resources//persons.xml")
		def personXML= new XmlParser().parse(personFile)

		def userNode = personXML.person.find{it -> 
			it.@username == username}	

		println "comment 0" 

		userNode.workoutPlan[0].day.each{it ->
			println "fyrir if <----------------"
			if(it.@id == id.toString() && goal.compareTo(it.@Goal ) == 0){
				ArrayList<Day> daysByID = new ArrayList<Day>();
					daysByID.add(getSpecificDay(username, it.@Date ))
				}
			}
			return daysByID

		}



}	