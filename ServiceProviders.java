package entities;
// Generated 24 mai 2020 05:58:50 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * ServiceProviders generated by hbm2java
 */
@Entity
@Table(name = "service_providers", catalog = "bookall")
public class ServiceProviders implements java.io.Serializable {

	private Long userId;
	private Users users;
	private int workingHours;
	private int breaks;
	private int vacations;
	private String profilPicture;
	private String bannerPicture;
	private String description;
	private boolean isBookingEnable;
	private Set<Businesses> businesseses = new HashSet<Businesses>(0);
	private Set<Reviews> reviewses = new HashSet<Reviews>(0);
	private Set<CorrespendenceServicesProvider> correspendenceServicesProviders = new HashSet<CorrespendenceServicesProvider>(
			0);
	private Set<Favorites> favoriteses = new HashSet<Favorites>(0);

	public ServiceProviders() {
	}

	public ServiceProviders(Users users, int workingHours, int breaks, int vacations, String profilPicture,
			String bannerPicture, String description, boolean isBookingEnable) {
		this.users = users;
		this.workingHours = workingHours;
		this.breaks = breaks;
		this.vacations = vacations;
		this.profilPicture = profilPicture;
		this.bannerPicture = bannerPicture;
		this.description = description;
		this.isBookingEnable = isBookingEnable;
	}

	public ServiceProviders(Users users, int workingHours, int breaks, int vacations, String profilPicture,
			String bannerPicture, String description, boolean isBookingEnable, Set<Businesses> businesseses,
			Set<Reviews> reviewses, Set<CorrespendenceServicesProvider> correspendenceServicesProviders,
			Set<Favorites> favoriteses) {
		this.users = users;
		this.workingHours = workingHours;
		this.breaks = breaks;
		this.vacations = vacations;
		this.profilPicture = profilPicture;
		this.bannerPicture = bannerPicture;
		this.description = description;
		this.isBookingEnable = isBookingEnable;
		this.businesseses = businesseses;
		this.reviewses = reviewses;
		this.correspendenceServicesProviders = correspendenceServicesProviders;
		this.favoriteses = favoriteses;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "users"))
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "user_id", unique = true, nullable = false)
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "working_hours", nullable = false)
	public int getWorkingHours() {
		return this.workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	@Column(name = "breaks", nullable = false)
	public int getBreaks() {
		return this.breaks;
	}

	public void setBreaks(int breaks) {
		this.breaks = breaks;
	}

	@Column(name = "vacations", nullable = false)
	public int getVacations() {
		return this.vacations;
	}

	public void setVacations(int vacations) {
		this.vacations = vacations;
	}

	@Column(name = "profil_picture", nullable = false, length = 65535)
	public String getProfilPicture() {
		return this.profilPicture;
	}

	public void setProfilPicture(String profilPicture) {
		this.profilPicture = profilPicture;
	}

	@Column(name = "banner_picture", nullable = false, length = 65535)
	public String getBannerPicture() {
		return this.bannerPicture;
	}

	public void setBannerPicture(String bannerPicture) {
		this.bannerPicture = bannerPicture;
	}

	@Column(name = "description", nullable = false, length = 65535)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "is_booking_enable", nullable = false)
	public boolean isIsBookingEnable() {
		return this.isBookingEnable;
	}

	public void setIsBookingEnable(boolean isBookingEnable) {
		this.isBookingEnable = isBookingEnable;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "serviceProviders")
	public Set<Businesses> getBusinesseses() {
		return this.businesseses;
	}

	public void setBusinesseses(Set<Businesses> businesseses) {
		this.businesseses = businesseses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "serviceProviders")
	public Set<Reviews> getReviewses() {
		return this.reviewses;
	}

	public void setReviewses(Set<Reviews> reviewses) {
		this.reviewses = reviewses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "serviceProviders")
	public Set<CorrespendenceServicesProvider> getCorrespendenceServicesProviders() {
		return this.correspendenceServicesProviders;
	}

	public void setCorrespendenceServicesProviders(
			Set<CorrespendenceServicesProvider> correspendenceServicesProviders) {
		this.correspendenceServicesProviders = correspendenceServicesProviders;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "serviceProviders")
	public Set<Favorites> getFavoriteses() {
		return this.favoriteses;
	}

	public void setFavoriteses(Set<Favorites> favoriteses) {
		this.favoriteses = favoriteses;
	}

}
