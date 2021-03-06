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
 * Notifications generated by hbm2java
 */
@Entity
@Table(name = "notifications", catalog = "bookall")
public class Notifications implements java.io.Serializable {

	private Long id;
	private Clients clients;
	private NotificationTypes notificationTypes;
	private int title;
	private String subtitle;
	private Date readAt;
	private Date createdAt;
	private boolean isPushNotification;

	public Notifications() {
	}

	public Notifications(Clients clients, NotificationTypes notificationTypes, int title, String subtitle, Date readAt,
			Date createdAt, boolean isPushNotification) {
		this.clients = clients;
		this.notificationTypes = notificationTypes;
		this.title = title;
		this.subtitle = subtitle;
		this.readAt = readAt;
		this.createdAt = createdAt;
		this.isPushNotification = isPushNotification;
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
	@JoinColumn(name = "client_fk", nullable = false)
	public Clients getClients() {
		return this.clients;
	}

	public void setClients(Clients clients) {
		this.clients = clients;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "notification_type_fk", nullable = false)
	public NotificationTypes getNotificationTypes() {
		return this.notificationTypes;
	}

	public void setNotificationTypes(NotificationTypes notificationTypes) {
		this.notificationTypes = notificationTypes;
	}

	@Column(name = "title", nullable = false)
	public int getTitle() {
		return this.title;
	}

	public void setTitle(int title) {
		this.title = title;
	}

	@Column(name = "subtitle", nullable = false, length = 20)
	public String getSubtitle() {
		return this.subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "read_at", nullable = false, length = 10)
	public Date getReadAt() {
		return this.readAt;
	}

	public void setReadAt(Date readAt) {
		this.readAt = readAt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created_at", nullable = false, length = 10)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Column(name = "is_push_notification", nullable = false)
	public boolean isIsPushNotification() {
		return this.isPushNotification;
	}

	public void setIsPushNotification(boolean isPushNotification) {
		this.isPushNotification = isPushNotification;
	}

}
