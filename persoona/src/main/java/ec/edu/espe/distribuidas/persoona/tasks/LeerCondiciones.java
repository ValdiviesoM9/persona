/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.persoona.tasks;

import ec.edu.espe.distribuidas.persoona.config.ApplicationValues;
import java.util.Properties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 *
 * @author mikeq
 */
@Slf4j
public class LeerCondiciones implements Tasklet, StepExecutionListener {

    private final ApplicationValues applicationValues;

    public LeerCondiciones(ApplicationValues applicationValues) {
        this.applicationValues = applicationValues;
    }
    
    

    
     @Override
    public void beforeStep(StepExecution se) {
        log.info("preparando motores");
      }
    
    @Override
    public RepeatStatus execute(StepContribution sc, ChunkContext cc) throws Exception {
        log.info("Va a ejecutar la tarea leer condiciones");
        Properties props = new Properties();
       Integer personas= Integer.parseInt(props.getProperty("personas"));
        log.info("va a generar () personas",personas);
        log.info("el archivo con condiciones es: {}",this.applicationValues.getConfigFile());
        return RepeatStatus.FINISHED;
    }
    
    @Override
    public ExitStatus afterStep(StepExecution se) {
   log.info("finalizo la ejecución");
   return ExitStatus.COMPLETED;
    }
    
}
