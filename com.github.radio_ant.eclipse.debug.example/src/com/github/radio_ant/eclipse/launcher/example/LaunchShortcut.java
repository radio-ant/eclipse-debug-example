package com.github.radio_ant.eclipse.launcher.example;

import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;

public class LaunchShortcut implements ILaunchShortcut {

	@Override
	public void launch(ISelection selection, String mode) {
		System.out.println("Selection: " + mode);
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
		System.out.println("Editor: " + mode);
	}
}
