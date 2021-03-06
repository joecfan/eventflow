/* Copyright 2013-2015 www.snakerflow.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.event.flow.core.praser.impl;


import com.event.flow.core.model.EndModel;
import com.event.flow.core.model.NodeModel;
import com.event.flow.core.praser.AbstractNodeParser;

/**
 * @author jun
 * @Date 17/9/3 .
 * @des: 结束节点解析
 */
public class EndParser extends AbstractNodeParser {
	/**
	 * 产生EndModel模型对象
	 */
	protected NodeModel newModel() {
		return new EndModel();
	}
}
