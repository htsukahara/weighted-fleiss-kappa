///////////////////////////////////////////////////////////////////////////////////////////////////////
/// Inter-Annotator Agreement
/// Copyright (c) 2021 DENSO IT LABORATORY, INC. All rights reserved.
///
/// Unless required by applicable law or agreed to in writing, 
/// software distributed under the License is distributed on an "AS IS" BASIS,
/// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
///////////////////////////////////////////////////////////////////////////////////////////////////////

/// History:
/// [000] 2021/10/14, Hiroshi Tsukahara, Created.
///
package jp.co.d_itlab.math;

/**
 * The interface for named parameters.
 */
public interface IParameter<T> 
{
	public String getKeyName();
	public String setKeyName(String keyName);
	public T getValue();
	public T setValue(T value);
}
