/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.kit.cockpit.sfmdesigner.servicefeaturemodel.provider;


import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Preference;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Preference} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PreferenceItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreferenceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCreationDatePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addValuePropertyDescriptor(object);
			addStakeholderGroupPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Creation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Preference_creationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Preference_creationDate_feature", "_UI_Preference_type"),
				 ServicefeaturemodelPackage.Literals.PREFERENCE__CREATION_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Preference_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Preference_value_feature", "_UI_Preference_type"),
				 ServicefeaturemodelPackage.Literals.PREFERENCE__VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Preference_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Preference_description_feature", "_UI_Preference_type"),
				 ServicefeaturemodelPackage.Literals.PREFERENCE__DESCRIPTION,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stakeholder Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStakeholderGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Preference_stakeholderGroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Preference_stakeholderGroup_feature", "_UI_Preference_type"),
				 ServicefeaturemodelPackage.Literals.PREFERENCE__STAKEHOLDER_GROUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Preference.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Preference"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String returnString = "Preference ";		
		
		// Stakeholder group
		if(((Preference)object).getStakeholderGroup() != null && ((Preference)object).getStakeholderGroup() != ""){
			returnString += "(" + ((Preference)object).getStakeholderGroup() + ", ";
		} else {
			returnString += "(<no stakeholder group provided>, ";
		}
		// Creation date
		DateFormat df = new SimpleDateFormat("E, dd MMM yyyy, HH:mm:ss");
		if(((Preference)object).getCreationDate() != null 
				&& ((Preference)object).getCreationDate().toString() != null 
				&& ((Preference)object).getCreationDate().toString() != "")
		{
			returnString += "created: " + df.format(((Preference)object).getCreationDate()) + "): ";
		} else {
			returnString += "created: <no value>): ";
		}
		
		// Preference value
		if(String.valueOf(((Preference)object).getValue()) != null && String.valueOf(((Preference)object).getValue()) != ""){
			returnString += String.valueOf(((Preference)object).getValue());
		} else {
			returnString += " <no value>";
		}
		return returnString;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Preference.class)) {
			case ServicefeaturemodelPackage.PREFERENCE__CREATION_DATE:
			case ServicefeaturemodelPackage.PREFERENCE__DESCRIPTION:
			case ServicefeaturemodelPackage.PREFERENCE__VALUE:
			case ServicefeaturemodelPackage.PREFERENCE__STAKEHOLDER_GROUP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ServiceFeatureModelEditPlugin.INSTANCE;
	}

}
