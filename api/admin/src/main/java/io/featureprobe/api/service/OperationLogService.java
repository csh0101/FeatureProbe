package io.featureprobe.api.service;

import io.featureprobe.api.dao.entity.OperationLog;
import io.featureprobe.api.dao.repository.OperationLogRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class OperationLogService {

    private OperationLogRepository operationLogRepository;

    public void save(OperationLog log) {
        operationLogRepository.save(log);
    }

}
