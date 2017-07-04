package com.github.radio_ant.eclipse.launcher.example;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class SampleTabGroup extends AbstractLaunchConfigurationTabGroup {


	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		setTabs(new ILaunchConfigurationTab[] { new SampleTab(), new CommonTab() });
	}
}
