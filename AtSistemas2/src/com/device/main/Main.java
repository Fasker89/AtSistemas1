package com.device.main;

import java.util.Scanner;

import com.device.manageImpl.DeviceManageImpl;

public class Main {
	private static DeviceManageImpl devManage = new DeviceManageImpl();

	public static void main(String[] args) {
		String input;
		Scanner sc = new Scanner(System.in);
		String option = "EXIT";
		do {
			showMenu();
			input = sc.nextLine();
			manageMenu(input);
		} while (option.equals("EXIT"));
	}

	public static void showMenu() {
		System.out.println("--------------------");
		System.out.println("Menu");
		System.out.println("--------------------");
		System.out.println("0 - Ver Dispositivos (STATE)");
		System.out.println("1 - Añadir Dispositivo (ADD+NOMBRE)");
		System.out.println("2 - Eliminar Dispositivo (DEL+NOMBRE)");
		System.out.println("3 - Encender Dispositivo (ON+NOMBRE)");
		System.out.println("4 - Apagar Disposistivo (OFF+NOMBRE)");
		System.out.println("5 - (EXIT)");
		System.out.println("Introduzca su opcion");
	}

	public static void manageMenu(String option) {
		String[] data = option.split(" ");
		if (data.length == 3) {
			if (data[0].contains("STATE")) {
				devManage.showDevices();
			} else if (data[0].contains("ADD")) {
				devManage.addDevice(data[1]);
			} else if (data[0].contains("DEL")) {
				devManage.delDevice(data[1]);
			} else if (data[0].contains("OFF")) {
				devManage.offStateDevice(data[1]);
			} else if (data[0].contains("ON")) {
				devManage.onStateDevice(data[1]);
			} else {
				System.out.println("OPCION NO DISPONIBLE");
			}
		}else {
			System.out.println("COMANDO INCORRECTO");
		}
	}

}
