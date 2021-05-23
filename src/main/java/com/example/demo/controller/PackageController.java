package com.example.demo.controller;

import com.example.demo.dto.ClientDto;
import com.example.demo.dto.OperatorDto;
import com.example.demo.dto.PackageDto;
import com.example.demo.entity.Client;
import com.example.demo.entity.ClientsPackages;
import com.example.demo.entity.Package;
import com.example.demo.service.Service;
import com.sun.xml.bind.v2.runtime.reflect.Lister;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationException;
import java.util.List;

@RestController
@RequestMapping("/package")
@AllArgsConstructor
@Log
@CrossOrigin
public class PackageController {
    private final Service service;

//    @PostMapping("/createPack")
//    public Long arrangeClientPackageByOperator(@RequestBody PackageDto packageDto) {
//        return service.savePackage(service.savePackage(packageDto)).getId();
//    }

    @PostMapping("/createClient")
    public Long registerClient(@RequestBody ClientDto clientDto){
        log.info("Handling save client: " + clientDto);
        return service.saveClient(clientDto).getId();
    }

    @PostMapping("/createPackage")
    public Long registerPackage(@RequestBody PackageDto packageDto){
        log.info("Handling save client: " + packageDto);
        return service.savePackage(packageDto).getId();
    }

//    @PostMapping("/regPack")
//    public ClientsPackages registerPackage(@RequestBody ClientsPackages clientsPackages){
//        return service.
//    }

    @GetMapping("/findAllOperators")
    public List<OperatorDto> findAllOperators() {
        log.info("Handling find all operators request");
        return service.findAllOperators();
    }


    @GetMapping("/findAllPackages")
    public List<PackageDto> findAllPackages() {
        log.info("Handling find all packages request");
        return service.findAllPackages();
    }

    @GetMapping("/findAllClients")
    public List<ClientDto> findAllClients() {
        log.info("Handling find all packages request");
        return service.findAllClients();
    }

}
