package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WandMagic: ImageVector
    get() {
        if (_WandMagic != null) {
            return _WandMagic!!
        }
        _WandMagic = ImageVector.Builder(
            name = "WandMagic",
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
                moveTo(14f, 7f)
                lineTo(16.829f, 9.828f)
                moveTo(3.698f, 19.565f)
                lineTo(4.263f, 20.131f)
                curveTo(4.659f, 20.527f, 4.857f, 20.725f, 5.086f, 20.799f)
                curveTo(5.287f, 20.865f, 5.503f, 20.865f, 5.704f, 20.799f)
                curveTo(5.932f, 20.725f, 6.13f, 20.527f, 6.526f, 20.131f)
                lineTo(20.083f, 6.574f)
                curveTo(20.479f, 6.178f, 20.677f, 5.98f, 20.751f, 5.752f)
                curveTo(20.816f, 5.551f, 20.816f, 5.335f, 20.751f, 5.134f)
                curveTo(20.677f, 4.906f, 20.479f, 4.708f, 20.083f, 4.312f)
                lineTo(19.517f, 3.746f)
                curveTo(19.121f, 3.35f, 18.923f, 3.152f, 18.695f, 3.078f)
                curveTo(18.494f, 3.012f, 18.278f, 3.012f, 18.077f, 3.078f)
                curveTo(17.848f, 3.152f, 17.65f, 3.35f, 17.254f, 3.746f)
                lineTo(3.698f, 17.303f)
                curveTo(3.302f, 17.699f, 3.104f, 17.897f, 3.029f, 18.125f)
                curveTo(2.964f, 18.326f, 2.964f, 18.542f, 3.029f, 18.743f)
                curveTo(3.104f, 18.971f, 3.302f, 19.169f, 3.698f, 19.565f)
                close()
            }
        }.build()

        return _WandMagic!!
    }

@Suppress("ObjectPropertyName")
private var _WandMagic: ImageVector? = null
