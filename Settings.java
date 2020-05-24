package entities;
// Generated 24 mai 2020 05:58:50 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Settings generated by hbm2java
 */
@Entity
@Table(name = "settings", catalog = "bookall")
public class Settings implements java.io.Serializable {

	private Long id;
	private LoginSignupMethods loginSignupMethods;
	private String username;
	private boolean enableNotifications;
	private ServiceproviderSettings serviceproviderSettings;
	private ServiceproviderSettings serviceproviderSettings;
	private ServiceproviderSettings serviceproviderSettings;

	public Settings() {
	}

	public Settings(LoginSignupMethods loginSignupMethods, String username, boolean enableNotifications) {
		this.loginSignupMethods = loginSignupMethods;
		this.username = username;
		this.enableNotifications = enableNotifications;
	}

	public Settings(LoginSignupMethods loginSignupMethods, String username, boolean enableNotifications,
			ServiceproviderSettings serviceproviderSettings, ServiceproviderSettings serviceproviderSettings,
			ServiceproviderSettings serviceproviderSettings) {
		this.loginSignupMethods = loginSignupMethods;
		this.username = username;
		this.enableNotifications = enableNotifications;
		this.serviceproviderSettings = serviceproviderSettings;
		this.serviceproviderSettings = serviceproviderSettings;
		this.serviceproviderSettings = serviceproviderSettings;
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
	@JoinColumn(name = "loginSignupMethod_fk", nullable = false)
	public LoginSignupMethods getLoginSignupMethods() {
		return this.loginSignupMethods;
	}

	public void setLoginSignupMethods(LoginSignupMethods loginSignupMethods) {
		this.loginSignupMethods = loginSignupMethods;
	}

	@Column(name = "username", nullable = false, length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "enable_notifications", nullable = false)
	public boolean isEnableNotifications() {
		return this.enableNotifications;
	}

	public void setEnableNotifications(boolean enableNotifications) {
		this.enableNotifications = enableNotifications;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "settings")
	public ServiceproviderSettings getServiceproviderSettings() {
		return this.serviceproviderSettings;
	}

	public void setServiceproviderSettings(ServiceproviderSettings serviceproviderSettings) {
		this.serviceproviderSettings = serviceproviderSettings;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "settings")
	public ServiceproviderSettings getServiceproviderSettings() {
		return this.serviceproviderSettings;
	}

	public void setServiceproviderSettings(ServiceproviderSettings serviceproviderSettings) {
		this.serviceproviderSettings = serviceproviderSettings;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "settings")
	public ServiceproviderSettings getServiceproviderSettings() {
		return this.serviceproviderSettings;
	}

	public void setServiceproviderSettings(ServiceproviderSettings serviceproviderSettings) {
		this.serviceproviderSettings = serviceproviderSettings;
	}

}
