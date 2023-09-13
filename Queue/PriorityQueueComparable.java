import java.util.*;

class Project implements Comparable{
	String projName = null;
	int teamSize = 0;
	int duration = 0;
	Project(String projName,int teamSize,int duration){
		this.projName=projName;
		this.teamSize=teamSize;
		this.duration=duration;
	}
	public int compareTo(Object obj){
		return this.teamSize - ((Project)obj).teamSize;
	}
	public String toString(){
		return "{" + projName + "," + teamSize + "," + duration + "}";
	}
}

class pqDemo{
	public static void main(String [] args){
		PriorityQueue pq = new PriorityQueue();
		pq.offer(new Project("ChatGPT", 120,180));
                pq.offer(new Project("Bard AI", 540,320));
                pq.offer(new Project("MyAI", 100,90));
/*		pq.offer(new Project("ChatGPT", 400,2));
                pq.offer(new Project("Bard AI", 200,3));
                pq.offer(new Project("MyAI", 700,1));*/
		System.out.println(pq);
	}
}
