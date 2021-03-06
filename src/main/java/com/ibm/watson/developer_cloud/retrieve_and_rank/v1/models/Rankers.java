/**
 * Copyright 2015 IBM Corp. All Rights Reserved.
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
package com.ibm.watson.developer_cloud.retrieve_and_rank.v1.models;

import java.util.List;

import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * Contains a list of {@link Ranker} objects
 *
 * @author Kazi S. Hasan (kshasan@us.ibm.com)
 * @version v1
 */

public class Rankers extends GenericModel {
	/** List of rankers */
	private List<Ranker> rankers;
	
	/**
	 * Returns the rankers.
	 *
	 * @return the list of Ranker objects
	 */
	public List<Ranker> getRanker() {
		return rankers;
	}

	/**
	 * Sets the list of rankers.
	 *
	 * @param rankers the rankers to set
	 */
	public void setRankers(List<Ranker> rankers) {
		this.rankers = rankers;
	}
}
