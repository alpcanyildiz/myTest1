package com.emusicstore.dao;

import com.emusicstore.model.Kullanici;

import java.util.List;

public interface BenimDao {

    List<Kullanici> getAllKullanici();

    public void silById(int id);






}
