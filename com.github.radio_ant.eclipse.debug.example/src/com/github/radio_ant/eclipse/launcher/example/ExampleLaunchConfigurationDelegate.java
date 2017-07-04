package com.github.radio_ant.eclipse.launcher.example;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

import com.github.radio_ant.eclipse.debug.example.ExampleDebugTarget;

public class ExampleLaunchConfigurationDelegate implements ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		String attribute = configuration.getAttribute(SampleLaunchConfigurationAttributes.CONSOLE_TEXT,
				"Simon says \"RUN!\"");
		
		 if (ILaunchManager.DEBUG_MODE.equals(mode)) {
		        IDebugTarget target = new ExampleDebugTarget(null, launch, attribute);// instanciate custom IDebugTarget
		        launch.addDebugTarget(target);
		    }
		
		System.out.println(attribute);
	}

}
