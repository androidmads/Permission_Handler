<h2>Add a Permission Handler Library</h2>
			compile 'com.androidmads.permissionhandler.library:PermissionHandler:1.0.0'
			
			repositories{
    		maven{
    			url 'https://dl.bintray.com/androidmads/maven'
    		}
			}
			
			
<h2>How to use this Library</h2>
		// For Handling Permissions for 6.0
        Integer[] perms = {
                Permissions.ACCESS_COARSE_LOCATION,
                Permissions.ACCESS_FINE_LOCATION,
        };

        PermissionHandler permissionHandler = new PermissionHandler(ActivityName.this);
        permissionHandler.isPermissionGranted(perms);
