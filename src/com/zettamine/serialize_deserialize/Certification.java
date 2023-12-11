package com.zettamine.serialize_deserialize;

import java.io.Serializable;
import java.util.Objects;

public class Certification implements Comparable<Certification>, Serializable{
	
	private int certificateId;
	private String title;
	private int ranking;
	
	public Certification(int certificateId, String title, int ranking) {
		super();
		this.certificateId = certificateId;
		this.title = title;
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		return " [certificateId=" + certificateId + ", title=" + title + ", ranking=" + ranking + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(certificateId, ranking, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Certification other = (Certification) obj;
		return certificateId == other.certificateId && ranking == other.ranking && Objects.equals(title, other.title);
	}

	@Override
	public int compareTo(Certification o) {
		if(this.ranking == o.ranking) {
			return this.certificateId - o.certificateId;
		}
		
		return this.ranking - o.ranking;
	}

	public int getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	

}
