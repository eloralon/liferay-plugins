/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.pushnotifications.util;

import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.util.portlet.PortletProps;

/**
 * @author Bruno Farache
 */
public class PortletPropsValues {

	public static final String APPLE_CERTIFICATE_PASSWORD =
		GetterUtil.getString(
			PortletProps.get(PortletPropsKeys.APPLE_CERTIFICATE_PASSWORD));

	public static final String APPLE_CERTIFICATE_PATH = GetterUtil.getString(
		PortletProps.get(PortletPropsKeys.APPLE_CERTIFICATE_PATH));

	public static final boolean APPLE_SANDBOX = GetterUtil.getBoolean(
		PortletProps.get(PortletPropsKeys.APPLE_SANDBOX));

}