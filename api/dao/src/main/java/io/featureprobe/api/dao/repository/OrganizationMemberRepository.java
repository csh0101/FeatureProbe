package io.featureprobe.api.dao.repository;

import io.featureprobe.api.dao.entity.OrganizationMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrganizationMemberRepository extends JpaRepository<OrganizationMember, Long>,
        JpaSpecificationExecutor<OrganizationMember> {

    Optional<OrganizationMember> findByOrganizationIdAndMemberId(Long organizationId, Long memberId);

    List<OrganizationMember> findByMemberId(Long memberId);
}
