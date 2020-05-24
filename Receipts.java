package entities;
// Generated 24 mai 2020 05:58:50 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Receipts generated by hbm2java
 */
@Entity
@Table(name = "receipts", catalog = "bookall")
public class Receipts implements java.io.Serializable {

	private Long id;
	private Bookings bookings;
	private Payements payements;
	private Date createdAt;
	private Date updatedAt;

	public Receipts() {
	}

	public Receipts(Bookings bookings, Payements payements, Date createdAt, Date updatedAt) {
		this.bookings = bookings;
		this.payements = payements;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "booking_fk", nullable = false)
	public Bookings getBookings() {
		return this.bookings;
	}

	public void setBookings(Bookings bookings) {
		this.bookings = bookings;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "payement_fk", nullable = false)
	public Payements getPayements() {
		return this.payements;
	}

	public void setPayements(Payements payements) {
		this.payements = payements;
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

}