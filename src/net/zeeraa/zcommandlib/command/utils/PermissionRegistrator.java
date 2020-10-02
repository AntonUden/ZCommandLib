package net.zeeraa.zcommandlib.command.utils;

import org.bukkit.Bukkit;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;

/**
 * This is used to register permissions without using the plugin.yml file
 * 
 * @author Zeeraa
 */
public class PermissionRegistrator {
	public static boolean registerPermission(String name) {
		return registerPermission(new Permission(name));
	}

	public static boolean registerPermission(String name, String description) {
		return registerPermission(new Permission(name, description));
	}

	public static boolean registerPermission(String name, String description, PermissionDefault defaultValue) {
		return registerPermission(new Permission(name, description, defaultValue));
	}

	public static boolean registerPermission(Permission permission) {
		if (Bukkit.getServer().getPluginManager().getPermission(permission.getName()) == null) {
			Bukkit.getServer().getPluginManager().addPermission(permission);

			return true;
		}
		return false;
	}
}