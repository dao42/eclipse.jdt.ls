/*******************************************************************************
 * Copyright (c) 2016 Red Hat Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat Inc. - initial API and implementation
 *******************************************************************************/
package org.jboss.tools.langs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DocumentFormattingParams {

	/**
	 *
	 * (Required)
	 *
	 */
	@SerializedName("textDocument")
	@Expose
	private TextDocumentIdentifier textDocument;
	/**
	 *
	 * (Required)
	 *
	 */
	@SerializedName("options")
	@Expose
	private FormattingOptions options;

	/**
	 *
	 * (Required)
	 *
	 * @return
	 *     The textDocument
	 */
	public TextDocumentIdentifier getTextDocument() {
		return textDocument;
	}

	/**
	 *
	 * (Required)
	 *
	 * @param textDocument
	 *     The textDocument
	 */
	public void setTextDocument(TextDocumentIdentifier textDocument) {
		this.textDocument = textDocument;
	}

	public DocumentFormattingParams withTextDocument(TextDocumentIdentifier textDocument) {
		this.textDocument = textDocument;
		return this;
	}

	/**
	 *
	 * (Required)
	 *
	 * @return
	 *     The options
	 */
	public FormattingOptions getOptions() {
		return options;
	}

	/**
	 *
	 * (Required)
	 *
	 * @param options
	 *     The options
	 */
	public void setOptions(FormattingOptions options) {
		this.options = options;
	}

	public DocumentFormattingParams withOptions(FormattingOptions options) {
		this.options = options;
		return this;
	}

}
