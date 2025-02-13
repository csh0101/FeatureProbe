package io.featureprobe.api.dao.entity;

import io.featureprobe.api.base.enums.OrganizationRoleEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "organization_member")
@DynamicInsert
public class OrganizationMember extends AbstractAuditEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "organization_id")
    Organization organization;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "member_id")
    private Member member;

    @Enumerated(EnumType.STRING)
    private OrganizationRoleEnum role;

    @Column(columnDefinition = "TINYINT")
    private Boolean valid;

}
