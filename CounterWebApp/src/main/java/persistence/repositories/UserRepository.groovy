package persistence.repositories

import groovy.xml.XmlUtil
import java.security.SecureRandom
import persistence.entities.User


public class UserRepository {

	def createNewUser(User user){
		def xmlFile=new File("${new File(new File(".").getCanonicalPath())}//src//main//resources//persons.xml")
		def xml= new XmlParser().parse(xmlFile)

		def username = xml.person.find{it -> 
			it.@username == user.getUsername()}
	

		if(username == null){
			println "inní if setnigunni"
			def userNode = new Node (xml, "person",[username: user.getUsername()])
			new Node (userNode, "name", user.getName())
			new Node (userNode, "password", user.getPassword())
			new Node (userNode, "email", user.getEmail())
			new Node (userNode, "age", user.getAge())
			new Node (userNode, "goal", user.getGoal())
			new Node (userNode, "gender", user.getGender())
			new Node (userNode, "userWeight", user.getUserWeight())
			new Node (userNode, "nextUpdate", user.getNextUpdate())
			new Node (userNode, "workoutPlan" )

			xmlFile.withWriter ("utf-8") {writer ->
			writer.writeLine(new XmlUtil().serialize(xml))
		}
			return true;
		}
		return false;
	}


	def findUser(String username){
		def xmlFile=new File("${new File(new File(".").getCanonicalPath())}//src//main//resources//persons.xml")
		def xml= new XmlParser().parse(xmlFile)

		def userNode = xml.person.find{it -> 
			it.@username == username}

		if(userNode!=null){
			//def obj = [name: userNode.name.text(), password: userNode.password.text()]
			User user = new User(userNode.name.text(), userNode.password.text(), userNode.email.text(), userNode.age.text().toInteger(), userNode.@username, userNode.goal.text(), userNode.gender.text(),userNode.userWeight.text().toDouble(), userNode.nextUpdate.text())
			//println obj.get("name")

			return user;
		}
	}


	def updateUser(User user){
		def xmlFile=new File("${new File(new File(".").getCanonicalPath())}//src//main//resources//persons.xml")
		def xml= new XmlParser().parse(xmlFile)

		def userNode = xml.person.find{it -> 
			it.@username == user.getUsername()}

		if(userNode != null){
			userNode.age[0].value = user.getAge()
			userNode.goal[0].value = user.getGoal()
			userNode.userWeight[0].value = user.getUserWeight()

			xmlFile.withWriter ("utf-8") {writer ->
				writer.writeLine(new XmlUtil().serialize(xml))
			}

		}


	}

}	