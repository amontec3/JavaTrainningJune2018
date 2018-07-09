package com.company.day21w5_decoratorDesignPatern;

public class DecoratorLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car baseCar = new SportsCar();
		
		Car baseCarWithSoundSystem = new MusicSystem(baseCar);
		
		Car baseCarWithSoundSystemAndBumperSticker = new BumperSticker(baseCarWithSoundSystem,"blue");
		
		
		
		System.out.println(baseCar.getClass());
		
		System.out.println(baseCarWithSoundSystem.getClass());

		
		System.out.println(baseCarWithSoundSystemAndBumperSticker.getDetails());

		System.out.println(baseCarWithSoundSystemAndBumperSticker.calculateCost());

	}

}
