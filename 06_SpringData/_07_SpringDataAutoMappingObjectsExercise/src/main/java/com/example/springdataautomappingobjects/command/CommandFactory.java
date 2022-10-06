package com.example.springdataautomappingobjects.command;

import com.example.springdataautomappingobjects.command.commandModels.*;
import com.example.springdataautomappingobjects.service.GameService;
import com.example.springdataautomappingobjects.service.RoleService;
import com.example.springdataautomappingobjects.service.UserService;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public final class CommandFactory {

    private final Map<String, Command> commands;

    public CommandFactory() {
        this.commands = new HashMap<>();
    }

    private void addCommand(final String name, final Command command){
        commands.putIfAbsent(name, command);
    }

    public void executeCommand(String[] tokens){
        String command = tokens[0];
        if (commands.containsKey(command)) {
            commands.get(command).apply(tokens);
        }
    }

    public void listCommands(){
        System.out.println(
                "Enable commands: Exit, "
                        + commands.keySet().stream().collect(Collectors.joining(", ")));
        System.out.println("LogoutUser - (command|email)");
    }

    public static CommandFactory initHome(GameService gameService, UserService userService, RoleService roleService){
        final CommandFactory cf = new CommandFactory();
        // It is possible to dynamically add commands without editing the code.
        cf.addCommand("RegisterUser", new RegisterUser(userService));
        cf.addCommand("LoginUser", new LoginUser(userService));

        return cf;
    }

    public static CommandFactory initUser(GameService gameService, UserService userService, RoleService roleService){
        final CommandFactory cfu = new CommandFactory();
        cfu.addCommand("LogoutUser", new LogoutUser(userService));
        cfu.addCommand("AllGame", new AllGames(gameService));
        cfu.addCommand("DetailGame", new DetailsGame(gameService));
        cfu.addCommand("OwnedGame", new OwnedGames(userService));

        return cfu;
    }

    public static CommandFactory initAdmin(GameService gameService, UserService userService, RoleService roleService){
        final CommandFactory cfa = new CommandFactory();
        cfa.addCommand("LogoutUser", new LogoutUser(userService));
        cfa.addCommand("AddGame", new AddGame(gameService));
        cfa.addCommand("EditGame", new EditGame(gameService));
        cfa.addCommand("DeleteGame", new DeleteGame(gameService));
        cfa.addCommand("AllGame", new AllGames(gameService));
        cfa.addCommand("DetailGame", new DetailsGame(gameService));
        cfa.addCommand("OwnedGame", new OwnedGames(userService));
        return cfa;
    }
}
