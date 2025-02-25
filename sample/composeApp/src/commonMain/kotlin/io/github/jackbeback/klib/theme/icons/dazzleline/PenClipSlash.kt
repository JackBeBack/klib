package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PenClipSlash: ImageVector
    get() {
        if (_PenClipSlash != null) {
            return _PenClipSlash!!
        }
        _PenClipSlash = ImageVector.Builder(
            name = "PenClipSlash",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.328f, 8.328f)
                lineTo(15.894f, 5.894f)
                curveTo(14.706f, 4.706f, 14.112f, 4.112f, 13.427f, 3.889f)
                curveTo(12.824f, 3.694f, 12.175f, 3.694f, 11.573f, 3.889f)
                curveTo(11.177f, 4.018f, 10.811f, 4.271f, 10.343f, 4.692f)
                moveTo(13.325f, 7.674f)
                lineTo(17.411f, 3.589f)
                curveTo(18.192f, 2.808f, 19.458f, 2.808f, 20.239f, 3.589f)
                curveTo(21.02f, 4.37f, 21.02f, 5.636f, 20.239f, 6.417f)
                lineTo(16.154f, 10.503f)
                moveTo(3f, 2.999f)
                lineTo(10.5f, 10.5f)
                moveTo(21f, 20.999f)
                lineTo(13.329f, 13.328f)
                moveTo(10.5f, 10.5f)
                lineTo(5.763f, 15.237f)
                curveTo(4.923f, 16.076f, 4.503f, 16.496f, 4.179f, 16.978f)
                curveTo(3.891f, 17.406f, 3.66f, 17.869f, 3.49f, 18.356f)
                curveTo(3.299f, 18.904f, 3.215f, 19.492f, 3.047f, 20.667f)
                lineTo(3f, 21f)
                lineTo(3.488f, 20.901f)
                curveTo(4.544f, 20.688f, 5.072f, 20.582f, 5.564f, 20.388f)
                curveTo(6.001f, 20.216f, 6.416f, 19.993f, 6.801f, 19.724f)
                curveTo(7.235f, 19.422f, 7.616f, 19.041f, 8.377f, 18.279f)
                lineTo(13.329f, 13.328f)
                moveTo(10.5f, 10.5f)
                lineTo(13.329f, 13.328f)
            }
        }.build()

        return _PenClipSlash!!
    }

@Suppress("ObjectPropertyName")
private var _PenClipSlash: ImageVector? = null
