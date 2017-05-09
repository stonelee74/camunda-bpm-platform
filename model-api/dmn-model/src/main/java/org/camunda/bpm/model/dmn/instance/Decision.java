/* Licensed under the Apache License, Version 2.0 (the "License");
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

package org.camunda.bpm.model.dmn.instance;

import java.util.Collection;

public interface Decision extends DrgElement {

  Question getQuestion();

  void setQuestion(Question question);

  AllowedAnswers getAllowedAnswers();

  void setAllowedAnswers(AllowedAnswers allowedAnswers);

  Variable getVariable();

  void setVariable(Variable variable);

  Collection<InformationRequirement> getInformationRequirements();

  Collection<KnowledgeRequirement> getKnowledgeRequirements();

  Collection<AuthorityRequirement> getAuthorityRequirements();

  Collection<SupportedObjectiveReference> getSupportedObjectiveReferences();

  Collection<PerformanceIndicator> getImpactedPerformanceIndicators();

  Collection<OrganizationUnit> getDecisionMakers();

  Collection<OrganizationUnit> getDecisionOwners();

  Collection<UsingProcessReference> getUsingProcessReferences();

  Collection<UsingTaskReference> getUsingTaskReferences();

  Expression getExpression();

  void setExpression(Expression expression);

  // camunda extensions
  Integer getCamundaHistoryTimeToLive();

  void setCamundaHistoryTimeToLive(Integer inputVariable);

  String getVersionTag();

  void setVersionTag(String inputValue);
}
