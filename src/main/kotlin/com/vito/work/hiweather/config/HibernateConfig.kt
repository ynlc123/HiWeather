package com.vito.work.weather.config

import org.hibernate.SessionFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.orm.hibernate5.HibernateTemplate
import javax.persistence.EntityManagerFactory

/**
 * Created by lingzhiyuan.
 * Date : 16/4/1.
 * Time : 下午4:28.
 * Description:
 *
 */

@Configuration
open class HibernateConfig {
    @Bean
    open fun EntityManagerFactory.sessionFactory(): SessionFactory
            = unwrap(SessionFactory::class.java)

    @Bean
    open fun SessionFactory.hibernateTemplate(): HibernateTemplate
            = HibernateTemplate(this)
}