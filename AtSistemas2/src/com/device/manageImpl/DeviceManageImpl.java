package com.device.manageImpl;

import java.util.ArrayList;

import com.device.entities.Device;
import com.device.manageService.DeviceManageService;

public class DeviceManageImpl implements DeviceManageService {

	static ArrayList<Device> deviceList = new ArrayList();

	@Override
	public void addDevice(String idName) {
		Device newDevice = new Device(idName);
		deviceList.add(newDevice);
		showDevices();
	}

	@Override
	public void delDevice(String idName) {
		Boolean exist = false;
		for (Device dev : deviceList) {
			if (dev.getIdName().equals(idName)) {
				deviceList.remove(dev);
				exist = true;
			}
		}
		existDevice(exist);
	}

	@Override
	public void offStateDevice(String idName) {
		Boolean exist = false;
		Integer index = 0;
		for (Device dev : deviceList) {
			if (dev.getIdName().equals(idName)) {
				deviceList.set(index, new Device(idName));
				exist = true;
			}
			index++;
		}
		existDevice(exist);
	}

	@Override
	public void onStateDevice(String idName) {
		Boolean exist = false;
		Integer index = 0;
		for (Device dev : deviceList) {
			if (dev.getIdName().equals(idName)) {
				deviceList.set(index, new Device(idName, 1));
				exist = true;
			}
			index++;
		}
		existDevice(exist);
	}

	@Override
	public void showDevices() {
		for (Device dev : deviceList) {
			if(deviceList.indexOf(dev)!=0) System.out.print(", ");
			System.out.print(dev.getIdName() + ": " + ((dev.getState() == 0) ? "OFF" : "ON"));
		}
		System.out.println();
	}

	private void existDevice(Boolean exist) {
		if (!exist) {
			System.out.println("El dispositivo no existe");
			
		}
		showDevices();
	}

}
