package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PenRuler: ImageVector
    get() {
        if (_PenRuler != null) {
            return _PenRuler!!
        }
        _PenRuler = ImageVector.Builder(
            name = "PenRuler",
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
                moveTo(11.89f, 9.11f)
                lineTo(6.526f, 3.746f)
                curveTo(6.13f, 3.35f, 5.932f, 3.152f, 5.704f, 3.078f)
                curveTo(5.503f, 3.012f, 5.287f, 3.012f, 5.086f, 3.078f)
                curveTo(4.857f, 3.152f, 4.659f, 3.35f, 4.263f, 3.746f)
                lineTo(3.698f, 4.312f)
                curveTo(3.302f, 4.708f, 3.104f, 4.906f, 3.029f, 5.134f)
                curveTo(2.964f, 5.335f, 2.964f, 5.551f, 3.029f, 5.752f)
                curveTo(3.104f, 5.98f, 3.302f, 6.178f, 3.698f, 6.574f)
                lineTo(9.062f, 11.939f)
                moveTo(14.719f, 11.939f)
                lineTo(20.083f, 17.303f)
                curveTo(20.479f, 17.699f, 20.677f, 17.897f, 20.751f, 18.125f)
                curveTo(20.816f, 18.326f, 20.816f, 18.542f, 20.751f, 18.743f)
                curveTo(20.677f, 18.971f, 20.479f, 19.169f, 20.083f, 19.565f)
                lineTo(19.517f, 20.131f)
                curveTo(19.121f, 20.527f, 18.923f, 20.725f, 18.695f, 20.799f)
                curveTo(18.494f, 20.865f, 18.278f, 20.865f, 18.077f, 20.799f)
                curveTo(17.848f, 20.725f, 17.65f, 20.527f, 17.254f, 20.131f)
                lineTo(11.89f, 14.767f)
                moveTo(8f, 7f)
                lineTo(8.889f, 6.109f)
                moveTo(17f, 16f)
                lineTo(17.895f, 15.114f)
                moveTo(15.5f, 5.502f)
                lineTo(18.328f, 8.33f)
                moveTo(3f, 21.002f)
                lineTo(3.047f, 20.67f)
                curveTo(3.215f, 19.494f, 3.299f, 18.907f, 3.49f, 18.358f)
                curveTo(3.66f, 17.871f, 3.891f, 17.408f, 4.179f, 16.98f)
                curveTo(4.503f, 16.498f, 4.923f, 16.079f, 5.763f, 15.239f)
                lineTo(17.411f, 3.591f)
                curveTo(18.192f, 2.81f, 19.458f, 2.81f, 20.239f, 3.591f)
                curveTo(21.02f, 4.372f, 21.02f, 5.638f, 20.239f, 6.419f)
                lineTo(8.377f, 18.281f)
                curveTo(7.616f, 19.043f, 7.235f, 19.424f, 6.801f, 19.726f)
                curveTo(6.416f, 19.995f, 6.001f, 20.218f, 5.564f, 20.39f)
                curveTo(5.072f, 20.584f, 4.544f, 20.69f, 3.488f, 20.903f)
                lineTo(3f, 21.002f)
                close()
            }
        }.build()

        return _PenRuler!!
    }

@Suppress("ObjectPropertyName")
private var _PenRuler: ImageVector? = null
