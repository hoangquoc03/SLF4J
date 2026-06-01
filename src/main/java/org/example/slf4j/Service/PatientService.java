package org.example.slf4j.Service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PatientService   {
    public void searchPatient(){
        log.trace("Start searching patient");
        log.info("Searching patient...");
    }
}
