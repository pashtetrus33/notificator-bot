package com.notificatorbot.repository;


import com.notificatorbot.model.AccessRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessRequestRepository extends JpaRepository<AccessRequest, Long>{
    public AccessRequest findByChatId(Long chatId);

    public Long deleteByChatId(Long chatId);
}
