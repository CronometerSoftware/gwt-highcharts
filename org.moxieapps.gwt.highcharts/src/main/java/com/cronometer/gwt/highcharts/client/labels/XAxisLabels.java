/*
 * Copyright 2011 Moxie Group
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

package com.cronometer.gwt.highcharts.client.labels;

/**
 * Represents the configuration options that can be set for the labels on the x-axis of a chart, and
 * can then be passed to the {@link com.cronometer.gwt.highcharts.client.XAxis#setLabels(com.cronometer.gwt.highcharts.client.labels.XAxisLabels)}
 * method.  Example usage:
 * <code><pre>
 *   chart.getXAxis().setLabels(
 *     new XAxisLabels()
 *       .setAlign(Labels.Align.LEFT)
 *       .setColor("#CC0000")
 *   );
 * </pre></code>
 *
 * @author squinn@moxiegroup.com (Shawn Quinn)
 * @since 1.0.0
 */
public class XAxisLabels extends Labels<XAxisLabels> {

    private AxisLabelsFormatter axisLabelsFormatter;

    /**
     * Sets a custom formatter for the labels on the axis that can be used to control how the text of the
     * labels will be displayed.  See the {@link AxisLabelsFormatter} interface, and
     * in particular the {@link AxisLabelsFormatter#format(AxisLabelsData)} method for more details on
     * the capabilities available to custom formatters.
     *
     * @param axisLabelsFormatter The custom formatter to use for the labels (if not given a built-in
     *                            generic formatter is used which simply returns the value as a string).
     * @return A reference to this {@link XAxisLabels} instance for convenient method chaining.
     */
    public XAxisLabels setFormatter(AxisLabelsFormatter axisLabelsFormatter) {
        this.axisLabelsFormatter = axisLabelsFormatter;
        return this;
    }

    /**
     * Returns the custom axis labels formatter that has been applied to the x-axis, or null if the
     * built-in generic formatter is being used instead.
     *
     * @return The custom axis labels formatter that has been applied to the x-axis, or null if it has not been set.
     */
    public AxisLabelsFormatter getFormatter() {
        return this.axisLabelsFormatter;
    }

    /**
     * Convenience method for setting the 'staggerLines' option for the labels.  Equivalent to:
     * <pre><code>
     *     xAxisLabels.setOption("staggerLines", 2);
     * </code></pre>
     * Horizontal axes only. The number of lines to spread the labels over to make room or tighter labels. Defaults to null.
     *
     * @param staggerLines The number of lines to spread the labels over to make room or tighter labels.
     * @return A reference to this {@link com.cronometer.gwt.highcharts.client.labels.XAxisLabels} instance for convenient method chaining.
     */
    public XAxisLabels setStaggerLines(Number staggerLines) {
        return this.setOption("staggerLines", staggerLines);
    }

    /**
     * Convenience method for setting the 'step' option for the labels.  Equivalent to:
     * <pre><code>
     *     xAxisLabels.setOption("step", 2);
     * </code></pre>
     * To show only every n'th label on the axis, set the step to n. E.g. - setting the step to
     * 2 shows every other label. Defaults to null.
     *
     * @param step o show only every n'th label on the axis, set the step to n.
     * @return A reference to this {@link com.cronometer.gwt.highcharts.client.labels.XAxisLabels} instance for convenient method chaining.
     */
    public XAxisLabels setStep(Number step) {
        return this.setOption("step", step);
    }


}
