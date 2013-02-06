/**
 * Copyright (C) 2012, Grass CRM Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gcrm.service;

import java.io.File;

import com.gcrm.domain.Document;

/**
 * Document service Interface
 */
public interface IDocumentService extends IBaseService<Document> {
    /**
     * Saves document
     * 
     * @param document
     *            document instance
     * @param f
     *            file that will be saved in document
     */
    public Document save(Document document, File f) throws Exception;

}
