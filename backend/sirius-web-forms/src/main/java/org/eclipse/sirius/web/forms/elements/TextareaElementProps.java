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
package org.eclipse.sirius.web.forms.elements;

import java.text.MessageFormat;
import java.util.Objects;
import java.util.function.Function;

import org.eclipse.sirius.web.annotations.Immutable;
import org.eclipse.sirius.web.components.IProps;
import org.eclipse.sirius.web.representations.Status;

/**
 * The properties of the textarea element.
 *
 * @author sbegaudeau
 */
@Immutable
public final class TextareaElementProps implements IProps {
    public static final String TYPE = "Textarea"; //$NON-NLS-1$

    private String id;

    private String label;

    private String value;

    private Function<String, Status> newValueHandler;

    private TextareaElementProps() {
        // Prevent instantiation
    }

    public String getId() {
        return this.id;
    }

    public String getLabel() {
        return this.label;
    }

    public String getValue() {
        return this.value;
    }

    public Function<String, Status> getNewValueHandler() {
        return this.newValueHandler;
    }

    public static Builder newTextareaElementProps(String id) {
        return new Builder(id);
    }

    @Override
    public String toString() {
        String pattern = "{0} '{'id: {1}, label: {2}, value: {3}'}'"; //$NON-NLS-1$
        return MessageFormat.format(pattern, this.getClass().getSimpleName(), this.id, this.label, this.value);
    }

    /**
     * The builder of the textarea element props.
     *
     * @author sbegaudeau
     */
    @SuppressWarnings("checkstyle:HiddenField")
    public static final class Builder {
        private String id;

        private String label;

        private String value;

        private Function<String, Status> newValueHandler;

        private Builder(String id) {
            this.id = Objects.requireNonNull(id);
        }

        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder newValueHandler(Function<String, Status> handler) {
            this.newValueHandler = Objects.requireNonNull(handler);
            return this;
        }

        public TextareaElementProps build() {
            TextareaElementProps textareaElementProps = new TextareaElementProps();
            textareaElementProps.id = Objects.requireNonNull(this.id);
            textareaElementProps.label = Objects.requireNonNull(this.label);
            textareaElementProps.value = Objects.requireNonNull(this.value);
            textareaElementProps.newValueHandler = Objects.requireNonNull(this.newValueHandler);
            return textareaElementProps;
        }
    }
}
