<a href='https://bintray.com/androidmads/maven/com.androidmads.permissionhandler.library/_latestVersion'><img src='https://api.bintray.com/packages/androidmads/maven/com.androidmads.permissionhandler.library/images/download.svg'></a>
			
			
<h2>How to use this Library</h2>
		// For Handling Permissions for 6.0
        Integer[] perms = {
                Permissions.ACCESS_COARSE_LOCATION,
                Permissions.ACCESS_FINE_LOCATION,
        };

        PermissionHandler permissionHandler = new PermissionHandler(ActivityName.this);
        permissionHandler.isPermissionGranted(perms);
