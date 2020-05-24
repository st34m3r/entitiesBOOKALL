package entities;
// Generated 24 mai 2020 05:58:50 by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CorrespendenceServicesProvider generated by hbm2java
 */
@Entity
@Table(name = "correspendence_services_provider", catalog = "bookall")
public class CorrespendenceServicesProvider implements java.io.Serializable {

	private CorrespendenceServicesProviderId id;
	private ServiceProviders serviceProviders;

	public CorrespendenceServicesProvider() {
	}

	public CorrespendenceServicesProvider(CorrespendenceServicesProviderId id, ServiceProviders serviceProviders) {
		this.id = id;
		this.serviceProviders = serviceProviders;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "providerFk", column = @Column(name = "provider_fk", nullable = false)),
			@AttributeOverride(name = "serviceFk", column = @Column(name = "service_fk", nullable = false)) })
	public CorrespendenceServicesProviderId getId() {
		return this.id;
	}

	public void setId(CorrespendenceServicesProviderId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "provider_fk", nullable = false, insertable = false, updatable = false)
	public ServiceProviders getServiceProviders() {
		return this.serviceProviders;
	}

	public void setServiceProviders(ServiceProviders serviceProviders) {
		this.serviceProviders = serviceProviders;
	}

}
