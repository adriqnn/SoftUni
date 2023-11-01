package _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.core;

import _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.core.commands.Command;
import _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.interfaces.Repository;
import _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.interfaces.Runnable;
import _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Engine implements Runnable {
    private static final String COMMAND_PATH_NAME = "_04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.core.commands.";
    private static final String EXECUTE_METHOD_NAME = "execute";

    private Repository repository;
    private UnitFactory unitFactory;

    public Engine(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            try {
                String input = reader.readLine();
                String[] data = input.split("\\s+");
                
                String commandName = data[0];
                String result = interpretCommand(data, commandName);
                
                if (result.equals("fight")) {
                    break;
                }
                
                System.out.println(result);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } catch (IOException | ExecutionControl.NotImplementedException e) {
                e.printStackTrace();
            }
        }
    }

    private String interpretCommand(String[] data, String commandName) throws ExecutionControl.NotImplementedException {
        String result = "";
        
        try {
            String commandClassName = commandName.substring(0, 1).toUpperCase() + commandName.substring(1, commandName.length());
            
            Class clazz = Class.forName(COMMAND_PATH_NAME + commandClassName);
            Constructor<Command> commandConstructor = clazz.getDeclaredConstructor(String[].class, Repository.class, UnitFactory.class);
            Command commandInstance = commandConstructor.newInstance(data, this.repository, this.unitFactory);
            Method executeMethod = clazz.getDeclaredMethod(EXECUTE_METHOD_NAME);
            
            try{
                result = (String) executeMethod.invoke(commandInstance);
            }catch (InvocationTargetException e){
                System.out.print(e.getCause().getMessage());
            }
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException | IllegalArgumentException e) {
            e.printStackTrace();
        }
        
        return result;

		/*
		String result;
		switch (commandName) {
			case "add":
				Add addCommand = new Add(data,this.repository,this.unitFactory);
				result = addCommand.execute();
				break;
			case "report":
				Report reportCommand = new Report(data,this.repository,this.unitFactory);
				result = reportCommand.execute();
				break;
			case "fight":
				Fight fightCommand = new Fight(data,this.repository,this.unitFactory);
				result = fightCommand.execute();
				break;
			default:
				throw new RuntimeException("Invalid command!");
		}
		
		return result;
		*/
    }
}
