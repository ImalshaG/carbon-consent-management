/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.consent.mgt.core.dao.impl;

import org.wso2.carbon.consent.mgt.core.dao.PIICategoryDAO;
import org.wso2.carbon.consent.mgt.core.exception.ConsentManagementException;
import org.wso2.carbon.consent.mgt.core.model.PIICategory;

/**
 * Default implementation of {@link PIICategoryDAO}. This handles {@link PIICategory} related DB operations.
 */
public class PIICategoryDAOImpl implements PIICategoryDAO {

    @Override
    public PIICategory addPIICategory(PIICategory piiCategory) throws ConsentManagementException {
        return null;
    }

    @Override
    public PIICategory getPIICategoryById(String id) throws ConsentManagementException {
        return null;
    }

    @Override
    public PIICategory getPIICategoryByName(String name) throws ConsentManagementException {
        return null;
    }
}
