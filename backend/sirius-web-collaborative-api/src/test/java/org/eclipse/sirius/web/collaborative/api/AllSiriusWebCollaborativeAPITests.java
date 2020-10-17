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
package org.eclipse.sirius.web.collaborative.api;

import org.eclipse.sirius.web.collaborative.api.architecture.CodingRulesTestCases;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Test suite of the project.
 *
 * @author sbegaudeau
 */
@RunWith(Suite.class)
//@formatter:off
@SuiteClasses({
    CodingRulesTestCases.class
})
//@formatter:on
public final class AllSiriusWebCollaborativeAPITests {
    private AllSiriusWebCollaborativeAPITests() {
        // Prevent instantiation
    }
}
