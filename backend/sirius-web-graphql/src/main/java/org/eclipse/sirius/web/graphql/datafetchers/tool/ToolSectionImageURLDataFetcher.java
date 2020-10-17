/*******************************************************************************
 * Copyright (c) 2019, 2020 Obeo.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.web.graphql.datafetchers.tool;

import org.eclipse.sirius.web.annotations.spring.graphql.QueryDataFetcher;
import org.eclipse.sirius.web.diagrams.tools.ToolSection;
import org.eclipse.sirius.web.graphql.schema.DiagramTypesProvider;
import org.eclipse.sirius.web.graphql.schema.ImageURLFieldProvider;
import org.eclipse.sirius.web.spring.graphql.api.IDataFetcherWithFieldCoordinates;
import org.eclipse.sirius.web.spring.graphql.api.URLConstants;

import graphql.schema.DataFetchingEnvironment;

/**
 * The data fetcher used to concatenate the server image URL to toolSection image path.
 * <p>
 * It will be used to fetch the data for the following GraphQL field:
 * </p>
 *
 * <pre>
 * type ToolSection {
 *   imageURL: String!
 * }
 * </pre>
 *
 * @author hmarchadour
 */
@QueryDataFetcher(type = DiagramTypesProvider.TOOL_SECTION_TYPE, field = ImageURLFieldProvider.IMAGE_URL_FIELD)
public class ToolSectionImageURLDataFetcher implements IDataFetcherWithFieldCoordinates<String> {

    @Override
    public String get(DataFetchingEnvironment environment) throws Exception {
        ToolSection toolSection = environment.getSource();
        return URLConstants.IMAGE_BASE_PATH + toolSection.getImageURL();
    }
}
