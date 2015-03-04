/**
 *  Copyright 2009, 2010 The Regents of the University of California
 *  Licensed under the Educational Community License, Version 2.0
 *  (the "License"); you may not use this file except in compliance
 *  with the License. You may obtain a copy of the License at
 *
 *  http://www.osedu.org/licenses/ECL-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an "AS IS"
 *  BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 *  or implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 *
 */

package org.opencastproject.adminui.impl.index;

import org.opencastproject.matterhorn.search.SearchIndexException;

import java.io.IOException;

/**
 * Stub implementation for the admin ui search index.
 */
public class AdminUISearchIndexStub extends AdminUISearchIndex {

  /**
   * Creates a new search index.
   *
   * @param indexName
   *          the name of the index
   * @param indexVersion
   *          the version
   * @param settingsPath
   *          the path to the index settings files
   * @throws SearchIndexException
   *           if the index cannot be created
   * @throws IOException
   *           if reading and writing from and to the index fails
   */
  public AdminUISearchIndexStub(String indexName, int indexVersion, String settingsPath) throws SearchIndexException,
          IOException {
    indexSettingsPath = settingsPath;
    super.init(indexName, indexVersion);
  }

  /**
   * Calls the underlying deactivate-method.
   *
   * @throws IOException
   */
  @Override
  public void close() throws IOException {
    super.close();
  }

}
