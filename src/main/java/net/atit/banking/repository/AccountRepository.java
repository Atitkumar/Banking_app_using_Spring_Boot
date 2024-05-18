package net.atit.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.atit.banking.entity.Account;

// To perform CRUD database JpaRepository<Entity class name, id type in Account class>
public interface AccountRepository extends JpaRepository<Account, Long> {

}
