package entities;
// Generated 24 mai 2020 05:58:50 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ReviewResponses generated by hbm2java
 */
@Entity
@Table(name = "review_responses", catalog = "bookall")
public class ReviewResponses implements java.io.Serializable {

	private Long id;
	private String message;
	private Date createdAt;
	private Date updatedAt;
	private Set<Reviews> reviewses = new HashSet<Reviews>(0);

	public ReviewResponses() {
	}

	public ReviewResponses(String message, Date createdAt, Date updatedAt) {
		this.message = message;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public ReviewResponses(String message, Date createdAt, Date updatedAt, Set<Reviews> reviewses) {
		this.message = message;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.reviewses = reviewses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "message", nullable = false, length = 65535)
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created_at", nullable = false, length = 10)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "updated_at", nullable = false, length = 10)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reviewResponses")
	public Set<Reviews> getReviewses() {
		return this.reviewses;
	}

	public void setReviewses(Set<Reviews> reviewses) {
		this.reviewses = reviewses;
	}

}
