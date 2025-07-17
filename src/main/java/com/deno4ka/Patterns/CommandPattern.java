package com.deno4ka.Patterns;

import java.util.HashMap;

public class CommandPattern {

    public static void main(String[] args) {
        CommandPattern main = new CommandPattern();
        CommandDemoNew commandDemoNew = main.new CommandDemoNew();
        commandDemoNew.main(null);
    }

    /**
     * The Command interface
     */
    interface Command {
        void execute();
    }

    /**
     * The Invoker class
     */
    class Switch {
        private final HashMap<String, Command> commandMap = new HashMap<>();

        public void register(String commandName, Command command) {
            commandMap.put(commandName, command);
        }

        public void execute(String commandName) {
            Command command = commandMap.get(commandName);
            if (command == null) {
                throw new IllegalStateException("no command registered for " + commandName);
            }
            command.execute();
        }
    }

    /**
     * The Receiver class
     */
    class Light {
        public String turnOn() {
            System.out.println("The light is on");
            return "";
        }

        public void turnOff() {
            System.out.println("The light is off");
        }
    }

    /**
     * The Command for turning on the light - ConcreteCommand #1
     */
    class SwitchOnCommand implements Command {
        private final Light light;

        public SwitchOnCommand(Light light) {
            this.light = light;
        }

        @Override // Command
        public void execute() {
            light.turnOn();
        }
    }

    /**
     * The Command for turning off the light - ConcreteCommand #2
     */
    class SwitchOffCommand implements Command {
        private final Light light;

        public SwitchOffCommand(Light light) {
            this.light = light;
        }

        @Override // Command
        public void execute() {
            light.turnOff();
        }
    }

    class CommandDemo {
        public void main(final String[] arguments) {
            Light lamp = new Light();

            Command switchOn = new SwitchOnCommand(lamp);
            Command switchOff = new SwitchOffCommand(lamp);

            Switch mySwitch = new Switch();
            mySwitch.register("on", switchOn);
            mySwitch.register("off", switchOff);

            mySwitch.execute("on");
            mySwitch.execute("off");
        }
    }

    class CommandDemoNew {
        public void main(final String[] arguments) {
            Light lamp = new Light();

            Command switchOn = lamp::turnOn;
            Command switchOff = lamp::turnOff;

            Switch mySwitch = new Switch();
            mySwitch.register("on", switchOn);
            mySwitch.register("off", switchOff);

            mySwitch.execute("on");
            mySwitch.execute("off");
        }
    }

}
