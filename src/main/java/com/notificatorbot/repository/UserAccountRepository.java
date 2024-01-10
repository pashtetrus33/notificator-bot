package com.notificatorbot.repository;



import com.notificatorbot.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Long>{
    public UserAccount findByChatId(Long chatId);

    public Long deleteByChatId(Long chatId);
}
