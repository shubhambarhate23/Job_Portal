package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_applications")
public class Application {
	
		@Id
	    @GeneratedValue(strategy = GenerationType .IDENTITY)
	    private int id;

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private user user;

	    @ManyToOne
	    @JoinColumn(name = "job_id")
	    private job job;
	    
	    public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public user getUser() {
			return user;
		}

		public void setUser(user user) {
			this.user = user;
		}

		public job getJob() {
			return job;
		}

		public void setJob(job job) {
			this.job = job;
		}

		public Application(int id, com.project.entity.user user, com.project.entity.job job) {
			super();
			this.id = id;
			this.user = user;
			this.job = job;
		}

		public Application() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Application [id=" + id + ", user=" + user + ", job=" + job + "]";
		}

}
