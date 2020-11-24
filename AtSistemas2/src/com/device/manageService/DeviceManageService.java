package com.device.manageService;

import com.device.entities.Device;

public interface DeviceManageService {

	public void addDevice(String idName);
	public void delDevice(String idName);
	public void offStateDevice(String idName);
	public void onStateDevice(String idName);
	public void showDevices();
}
