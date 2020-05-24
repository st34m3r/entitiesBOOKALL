package entities;
// Generated 24 mai 2020 05:58:50 by Hibernate Tools 4.3.5.Final

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

/**
 * LoginSignupMethods generated by hbm2java
 */
@Entity
@Table(name = "login_signup_methods", catalog = "bookall")
public class LoginSignupMethods implements java.io.Serializable {

	private Long id;
	private String name;
	private Set<Settings> settingses = new HashSet<Settings>(0);

	public LoginSignupMethods() {
	}

	public LoginSignupMethods(String name) {
		this.name = name;
	}

	public LoginSignupMethods(String name, Set<Settings> settingses) {
		this.name = name;
		this.settingses = settingses;
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

	@Column(name = "name", nullable = false, length = 10)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "loginSignupMethods")
	public Set<Settings> getSettingses() {
		return this.settingses;
	}

	public void setSettingses(Set<Settings> settingses) {
		this.settingses = settingses;
	}

}
