package org.dadacoalition.yedit.preferences;

import org.dadacoalition.yedit.Activator;
import org.eclipse.jface.preference.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;

/**
 * The UI for setting the YEdit preferences
 * @author oysteto
 *
 */
public class ColorPreferences
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public ColorPreferences() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("YEdit Color Preferences for syntax highlighting");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
    
		addField(new ColorFieldEditor(PreferenceConstants.COLOR_DEFAULT, "Default", getFieldEditorParent() ) );
		addField(new ColorFieldEditor(PreferenceConstants.COLOR_COMMENT, "Comments", getFieldEditorParent() ) );
		addField(new ColorFieldEditor(PreferenceConstants.COLOR_KEY, "Keys", getFieldEditorParent() ) );
		addField(new ColorFieldEditor(PreferenceConstants.COLOR_DOCUMENT, "Documents", getFieldEditorParent() ) );
		addField(new ColorFieldEditor(PreferenceConstants.COLOR_SCALAR, "Scalars", getFieldEditorParent() ) );	
		addField(new ColorFieldEditor(PreferenceConstants.COLOR_ANCHOR, "Anchors", getFieldEditorParent() ) );
		addField(new ColorFieldEditor(PreferenceConstants.COLOR_ALIAS, "Alias", getFieldEditorParent() ) );
		addField(new ColorFieldEditor(PreferenceConstants.COLOR_TAG_PROPERTY, "Tag properties", getFieldEditorParent() ) );
        addField(new ColorFieldEditor(PreferenceConstants.COLOR_CONSTANT, "Constants", getFieldEditorParent() ) );		
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}