package com.webapp.model;

import com.webapp.entity.Registro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Repository
public interface RegistroRepository {// extends JpaRepository{

    //public User findByUsuario(String usuario);
    //public User findByUsuario(String usuario);
    List<Registro> findByUsuario(String usuario);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM zeus_plus_log WHERE usuario=?1", nativeQuery = true)
    void removeByUsuario(String usuario);

    @Query(value = "SELECT * FROM zeus_plus_log u where u.id like %?1% or u.pagina like %?1% or u.evento like %?1% or u.criterio like %?1%  or u.resultado like %?1% or u.detalle like %?1% or u.usuario like %?1% or u.ip like %?1% or u.fecha like %?1%", nativeQuery = true)
    List<Registro> select(String input);


}
